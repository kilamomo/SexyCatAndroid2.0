 /*****************************
 * Copyright (c) 2014 by Hisunflytone Co. Ltd.  All rights reserved.
 ****************************/
package sexycat.android.com.sexycatandroid20.bean;

 import sexycat.android.com.sexycatandroid20.common.UrlConfig;

 /**
  * @{# UserInfo.java Create on 2014-4-29 下午5:50:12
  * <p>
  *
  * </p>
  * @author linwd
  * @version v3.0.0
  */
 public class UserInfo {

     @Deprecated

     public String userId;

     @Deprecated

     public String userName;


     public String nickName;


     public String openId;


     public String avatarUrl;


     public String accessToken;


     public int accessExpire;


     public String refreshToken;


     public int refreshExpire;


     public String imToken;

     public String getAvatarUrl(){
         return UrlConfig.BASE_PIC_URL + avatarUrl;
     }
 }
