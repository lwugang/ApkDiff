package com.leewug.src.diff;

/**
 * @author liwg
 * @version v1.0.0
 * @name DiffUtils
 * @description
 */
public class DiffUtils {

    static {
        System.loadLibrary("diffutils");
    }

    /**
     * native方法 通过oldPath和patchPath合并生成 新文件存储到newPath
     *
     * 返回：0，说明操作成功
     *
     * @param oldPath 示例:/sdcard/old.apk
     * @param newPath 示例:/sdcard/new.apk
     * @param patchPath  示例:/sdcard/xx.patch
     * @return
     */
    public static native int patch(String oldPath, String newPath,
                                   String patchPath);

}
