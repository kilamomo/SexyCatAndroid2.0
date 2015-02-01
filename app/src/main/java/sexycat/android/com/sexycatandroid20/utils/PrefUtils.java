package sexycat.android.com.sexycatandroid20.utils;

import android.content.SharedPreferences;

import sexycat.android.com.sexycatandroid20.common.SexCatApplication;

public class PrefUtils {
    /**
     * 在SharedPreferences中写入指定的内容
     *
     * @param name
     * @param key
     * @return
     */
    public static void WriteSharedPreferencesInt(String name, String key,
                                                 int value) {
        SharedPreferences.Editor userInfoEditor = SexCatApplication.getInstance()
                .getSharedPreferences(name, SexCatApplication.getInstance().MODE_PRIVATE).edit();
        userInfoEditor.putInt(key, value);
        userInfoEditor.commit();
    }

    /**
     * 在SharedPreferences中读取指定的内容
     *
     * @param name
     * @param key
     * @return
     */
    public static int ReadSharedPreferencesInt(String name, String key,
                                               int defValue) {
        try {
            SharedPreferences userInfo = SexCatApplication.getInstance()
                    .getSharedPreferences(name, SexCatApplication.getInstance().MODE_PRIVATE);
            return userInfo.getInt(key, defValue);
        } catch (NullPointerException e) {
            return defValue;
        }
    }

    /**
     * 在SharedPreferences中读取指定的内容
     *
     * @param name
     * @param key
     * @return 默认为true
     */
    public static boolean ReadSharedPreferencesBoolean(String name, String key) {
        try {
            SharedPreferences userInfo = SexCatApplication.getInstance()
                    .getSharedPreferences(name, SexCatApplication.getInstance().MODE_PRIVATE);
            return userInfo.getBoolean(key, false);
        } catch (NullPointerException e) {
            return true;
        }
    }

    /**
     * 向SharedPreferences中写入指定的内容
     *
     * @param name
     * @param key
     * @param value
     */
    public static void WriteSharedPreferencesBoolean(String name, String key,
                                                     boolean value) {
        SharedPreferences.Editor userInfoEditor = SexCatApplication.getInstance()
                .getSharedPreferences(name, SexCatApplication.getInstance().MODE_PRIVATE).edit();
        userInfoEditor.putBoolean(key, value);
        userInfoEditor.commit();
    }

    /**
     * 在SharedPreferences中读取指定的内容
     *
     * @param name
     * @param key
     * @return 默认为空“”
     */
    public static String ReadSharedPreferencesString(String name, String key) {
        try {
            SharedPreferences userInfo = SexCatApplication.getInstance()
                    .getSharedPreferences(name, SexCatApplication.getInstance().MODE_PRIVATE);
            return userInfo.getString(key,null);
        } catch (NullPointerException e) {
            return null;
        }
    }

    /**
     * @param name
     * @param key
     * @param value
     */

    public static void WriteSharedPreferencesString(String name, String key,
                                                    String value) {
        SharedPreferences.Editor userInfoEditor = SexCatApplication.getInstance()
                .getSharedPreferences(name, SexCatApplication.getInstance().MODE_PRIVATE).edit();
        userInfoEditor.putString(key, value);
        userInfoEditor.commit();
    }

    public static long ReadSharedPreferencesLong(String name, String key,
                                                 long defValue) {
        try {
            SharedPreferences userInfo = SexCatApplication.getInstance()
                    .getSharedPreferences(name, SexCatApplication.getInstance().MODE_PRIVATE);
            return userInfo.getLong(key, defValue);
        } catch (NullPointerException e) {
            return defValue;
        }
    }

    public static void WriteSharedPreferencesLong(String name, String key,
                                                  long value) {
        SharedPreferences.Editor userInfoEditor = SexCatApplication.getInstance()
                .getSharedPreferences(name, SexCatApplication.getInstance().MODE_PRIVATE).edit();
        userInfoEditor.putLong(key, value);
        userInfoEditor.commit();
    }
}
