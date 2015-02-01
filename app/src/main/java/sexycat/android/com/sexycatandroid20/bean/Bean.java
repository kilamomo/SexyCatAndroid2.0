 /*****************************
 * Copyright (c) 2014 by Hisunflytone Co. Ltd.  All rights reserved.
 ****************************/
package sexycat.android.com.sexycatandroid20.bean;


 /**
  * @{# Bean.java Create on 2014-4-9 上午11:38:04
  * <p>
  *
  * </p>
  * @author linwd
  * @version v3.0.0
  */
 public class Bean<T> {

     public int code;

     public String msg;


     public int errcode;


     public T result;

     public Bean(){
     }

     public Bean(int code, String msg){
         this.code = code;
         this.msg = msg;
     }

 }
