package sexycat.android.com.sexycatandroid20.common;

import android.util.Log;
import com.loopj.android.http.RequestParams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import sexycat.android.com.sexycatandroid20.utils.DeviceUtils;
import sexycat.android.com.sexycatandroid20.utils.MD5Util;

public class UrlConfig {

	private final static String BASE_URL = "http://api.xiaoyemao.com.cn/app/v1/";
	
	public final static String BASE_PIC_URL = "http://image.xiaoyemao.com.cn";
	
	public final static String BASE_THUMB_480_URL = BASE_PIC_URL + "/thumb/480-480/";//缩略图480*480
	
	public final static String BASE_THUMB_640_URL = BASE_PIC_URL + "/thumb/640-480/";//缩略图480*640
	
	public final static String BASE_THUMB_148_URL = BASE_PIC_URL + "/thumb/148-110/";//缩略图148*110
	
	public final static String BASE_THUMB_168_URL = BASE_PIC_URL + "/thumb/168-82/";//缩略图168*82
	
	public final static String BASE_THUMB_615_URL = BASE_PIC_URL + "/thumb/615-300/";//缩略图615*300
	
	public final static String BASE_THUMB_315_URL = BASE_PIC_URL + "/thumb/640-315/";//缩略图640*315
	
	public final static String BASE_THUMB_240_URL = BASE_PIC_URL + "/thumb/240-240/";//缩略图240*240
	
	public final static String BASE_THUMB_145_URL = BASE_PIC_URL + "/thumb/145-110/";//缩略图145*110
	
	public final static String BASE_SOURCE_URL = BASE_PIC_URL + "/source/";//原图
	
	public final static String BASE_WATERFALL_URL = BASE_PIC_URL + "/thumb/p320/";//瀑布流图片
	
	public final static String BASE_WEB_URL = "http://api.xiaoyemao.com.cn";
	
	public final static String PLAY_URL = BASE_WEB_URL + "/MobileWeb/Game/newindex";
	
	private final static String PRODUCT_URL = BASE_WEB_URL + "/MobileWeb/Product/detail/";
	
	public final static String ORDER_URL = BASE_WEB_URL + "/MobileWeb/Orderform/mylist/";
	
	public final static String MALL_ORDER_URL = BASE_WEB_URL + "/MobileWeb/Orderform/center";
	
	public final static String MALL_DETAIL_URL = BASE_WEB_URL + "/MobileWeb/Product/newdetailshow";
	
	public final static String MALL_PRIVACY_URL = BASE_WEB_URL + "/MobileWeb/Product/newprivacypolicy";
	
	public final static String INSTRUCTION_URL = BASE_WEB_URL + "/MobileWeb/Product/newmyinstructions";
	
	private final static String VERSION = "Version/newversion";
	//注册
	private final static String REGISTER = "User/reg";
	//登陆
	private final static String LOGIN = "User/auth";
	
	private final static String LOGOUT = "User/logout";
	
	private final static String REFRESH = "User/refresh";
	
	private final static String LINK_LIST = "Link/listpage";
	
	private final static String NEW_LIST = "Link/listnew";
	
	private final static String POST_LINK = "Link/addnew";
	
	private final static String ADD_LIKE = "LinkLike/addnew";
	
	private final static String LIKE_COUNT = "LinkLike/count";
	
	private final static String SUBMIT_COMMENT = "Comment/addnew";
	
	private final static String COMMENT_LIST = "Comment/listpage";
	
	private final static String NEW_COMMENT_LIST = "Comment/listnew";
	
	private final static String COMMENT_COUNT = "Comment/newcount";
	
	private final static String UPDATE_NICKNAME = "User/updatenickname";
	
	private final static String UPDATE_AVATAR = "User/updateavatar";
	
	private final static String GET_ORDER_INFO = "Orderform/orderinfo";
	
	private final static String SUBMIT_ACTION = "Index/reportaction";
	
	private final static String SUBMIT_CLIENTID = "Pushclientid/record";
	
	public final static String PAY_NOTIFY_URL = "http://api.xiaoyemao.com.cn/MobileWeb/Apppay/notifypay";
	
	public final static String MALL_LIST = "Product/listpage/";
	
	public final static String MALL_DETAIL = "Product/detail/";
	
	public final static String MALL_COMMENT = "Product/commentlist/";
	
	public final static String GET_ADVERTISEMENT = "Advertising/waterfall";
	
	public final static String LINK_DETAIL = "Link/detail";
	
	public final static String LINK_COMMENT = "Link/commentlist";
	
	public final static String ADDR_LIST = "Address/mylist";
	
	public final static String SUBMIT_ORDER = "Orderform/addnew";
	
	public final static String ADD_ADDR = "Address/addnew";
	
	public final static String ORDER_LIST = "Orderform/mylist";
	
	public final static String ORDER_DETAIL = "Orderform/detail";
	
	public final static String ORDER_CANCEL = "Orderform/ordercancel";
	
	public final static String ORDER_CONFIRM = "Orderform/ordercomplete";

	public final static String TOPIC_LIST = "Talktopic/listpage";
	
	public final static String MY_TOPIC_LIST = "Talktopic/mylist";
	
	public final static String PIC_LIST = "TalkRandimage/randtopic";
	
	public final static String PUBLISH_TOPIC = "Talktopic/addnew";
	
	public final static String TOPIC_LIKE = "TalkLike/addnew";
	
	public final static String TOPIC_COMMENT = "Talkcomment/listpage";
	
	public final static String TOPIC_REPLY = "Talkcomment/addnew";
	
	public final static String MSG_LIST = "Message/mylist";
	
	public final static String MY_STATUS = "Message/mynews";
	
	public final static String MARK_READ = "Message/read";
	
	public final static String USER_STATUS = "User/center";
	
	public final static String TOPIC_DETAIL = "Talktopic/detail";
	
	public final static String CATEGORY_LIST = "LinkDatatype/listall";
	
	public final static String FETCH_IM_TOKEN = "User/refreshRYToken";
	
	public final static String EDIT_ADDR = "Address/modify";

    public final static String INSTRUCTION_LIST = "Product/myinstructions";

    public final static String DEL_ADDR = "Address/deladdress";

	
	public static String getRegUrl(){
		StringBuilder str = new StringBuilder(BASE_URL);
		str.append(REGISTER);
		return str.toString();
	}
	
	public static RequestParams getRegParams(String loginname, String nickname, String email, String password){
		RequestParams params = new RequestParams();
		
		String appid = Constants.SEXYCAT_APPID;
		String appkey = Constants.SEXYCAT_APPKEY;
		String passwordForMD5 = MD5Util.getMD5(password);
		String uuid = DeviceUtils.getUUID();
		String hash = appid+appkey+loginname+nickname+email+passwordForMD5+uuid;
		String hashForMD5 = MD5Util.getMD5(hash);
		
		params.put("appid", appid);
		params.put("loginname", loginname);
		params.put("nickname", nickname);
		params.put("email", email);
		params.put("password", passwordForMD5);
		params.put("uuid", uuid);
		params.put("hash", hashForMD5);
		params.put("channel", DeviceUtils.getChannelId());
		params.put("versionnum", DeviceUtils.getVersionName());
		params.put("channel", DeviceUtils.getChannelId());
		
		return params;
	}
	
	public static RequestParams getRegParams(){
		RequestParams params = new RequestParams();
		
		String appid = Constants.SEXYCAT_APPID;
		String appkey = Constants.SEXYCAT_APPKEY;
		String loginname = DeviceUtils.getUUID();
		String nickname = "";
		String email = DeviceUtils.getUUID();
		String passwordForMD5 = "";
		String uuid = DeviceUtils.getUUID();
		String hash = appid+appkey+loginname+nickname+email+passwordForMD5+uuid;
		String hashForMD5 = MD5Util.getMD5(hash);
		
		params.put("appid", appid);
		params.put("loginname", loginname);
		params.put("nickname", nickname);
		params.put("email", email);
		params.put("password", passwordForMD5);
		params.put("uuid", uuid);
		params.put("hash", hashForMD5);
		params.put("channel", DeviceUtils.getChannelId());
		params.put("versionnum", DeviceUtils.getVersionName());
		params.put("channel", DeviceUtils.getChannelId());
		
		return params;
	}
	
	public static String getLoginUrl(){
		StringBuilder str = new StringBuilder(BASE_URL);
		str.append(LOGIN);
		return str.toString();
	}
	
	public static RequestParams getLoginParams(){
		RequestParams params = new RequestParams();
		
		String appid = Constants.SEXYCAT_APPID;
		String appkey = Constants.SEXYCAT_APPKEY;
		String loginname = DeviceUtils.getUUID();
		String passwordForMD5 = "";
		String uuid = DeviceUtils.getUUID();
		String hash = appid+appkey+loginname+passwordForMD5+uuid;
		String hashForMD5 = MD5Util.getMD5(hash);
		
		params.put("appid", appid);
		params.put("loginname", loginname);
		params.put("password", passwordForMD5);
		params.put("uuid", uuid);
		params.put("hash", hashForMD5);
		params.put("versionnum", DeviceUtils.getVersionName());
		params.put("channel", DeviceUtils.getChannelId());
		
		return params;
	}
	
	public static RequestParams getLoginParams(String loginname, String password){
		RequestParams params = new RequestParams();
		
		String appid = Constants.SEXYCAT_APPID;
		String appkey = Constants.SEXYCAT_APPKEY;
		String passwordForMD5 = password;//传入的已经是加密过的了
		String uuid = DeviceUtils.getUUID();
		String hash = appid+appkey+loginname+passwordForMD5+uuid;
		String hashForMD5 = MD5Util.getMD5(hash);
		
		params.put("appid", appid);
		params.put("loginname", loginname);
		params.put("password", passwordForMD5);
		params.put("uuid", uuid);
		params.put("hash", hashForMD5);
		params.put("versionnum", DeviceUtils.getVersionName());
		params.put("channel", DeviceUtils.getChannelId());
		
		return params;
	}
}
