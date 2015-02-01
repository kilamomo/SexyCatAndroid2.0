package sexycat.android.com.sexycatandroid20.http;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import java.io.File;
import java.util.ArrayList;

import sexycat.android.com.sexycatandroid20.common.UrlConfig;
import sexycat.android.com.sexycatandroid20.iface.IHttpReqListener;
import sexycat.android.com.sexycatandroid20.bean.Bean;
import sexycat.android.com.sexycatandroid20.bean.UserBean;
import sexycat.android.com.sexycatandroid20.utils.DeviceUtils;

public class HttpReq {
	
	private static AsyncHttpClient client = new AsyncHttpClient();
	private IHttpReqListener mListener;
	private Handler mHandler = new Handler();
	
	private int type, sum;
	private String timeflag;
	private String id, content, replyid, addrId, picId, topicId, commentId, datatype;
	private ArrayList<File> fileList;
	private String nickname, email, password, loginname;
	private String uri;
	private String userAction;
	private File file;
	private int start, order;
	
	public HttpReq(IHttpReqListener listener) {
		mListener = listener;
	}
	
	public void execute(int action){
		execute(action, null);
	}
	
	@SuppressWarnings("unchecked")
	public void execute(int action, Bundle bundle) {
        Log.v("Action:", action + "");
		switch (action) {
		case Action.REGISTER_WITH_EMAIL:
			loginname = bundle.getString("loginname");
			nickname = bundle.getString("nickname");
			email = bundle.getString("email");
			password = bundle.getString("password");
			doPost(Action.REGISTER_WITH_EMAIL, UrlConfig.getRegUrl(), UrlConfig.getRegParams(loginname, nickname, email, password), UserBean.class, bundle);
			break;
			
		case Action.REGISTER_WITH_UUID:
			doPost(Action.REGISTER_WITH_UUID, UrlConfig.getRegUrl(), UrlConfig.getRegParams(), UserBean.class, bundle);
			break;
			
		case Action.LOGIN_WITH_UUID:
			doPost(Action.LOGIN_WITH_UUID, UrlConfig.getLoginUrl(), UrlConfig.getLoginParams(), UserBean.class, bundle);
			break;
			
		case Action.LOGIN_WITH_EMAIL:
			loginname = bundle.getString("loginname");
			password = bundle.getString("password");
			doPost(Action.LOGIN_WITH_EMAIL, UrlConfig.getLoginUrl(), UrlConfig.getLoginParams(loginname, password), UserBean.class, bundle);
			break;

		default:
			break;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private <T> void doPost(final int actionId, final String url, final RequestParams params, final Class<T> cls, final Bundle bundle){
		Log.i("httpreq", "url:" + url);
		if (!DeviceUtils.isNetworkAvailable()){
			mHandler.postDelayed(new Runnable() {
				
				@Override
				public void run() {
					Bean bean = new Bean(Code.FAIL, Msg.NETWORK_ERR);
					bean.errcode = -99;
					mListener.OnComplete(actionId, bean);
				}
			}, 50);
			return;
		}
		client.post(url, params, new AsyncHttpResponseHandler(){

			@Override
			public void onSuccess(String response) {
				String msg=response;

				Log.e("httpreq", "onSuccess Error Msg:" + msg);
				mListener.OnComplete(actionId, new Bean<T>(Code.FAIL, Msg.FAIL));
			}
			
			@Override
			public void onFailure(Throwable arg0, String arg1) {
				Log.e("httpreq", "onFailure Error Msg:" + arg0.getMessage());
				mListener.OnComplete(actionId, new Bean<T>(Code.FAIL, Msg.FAIL));
			}
		});
		
	}
}
