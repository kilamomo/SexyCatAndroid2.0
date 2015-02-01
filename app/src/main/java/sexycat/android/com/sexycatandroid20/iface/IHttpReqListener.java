package sexycat.android.com.sexycatandroid20.iface;

import sexycat.android.com.sexycatandroid20.bean.Bean;

public interface IHttpReqListener {
    /**
     * http 信息返回接口
     */
	public <T> void OnComplete(int action, Bean<T> bean);

}
