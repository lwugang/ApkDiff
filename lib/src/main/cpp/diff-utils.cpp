#include <jni.h>
#include <string>
#include <android/log.h>
#include <exception>

#include "bsdiff.h"
extern "C"
JNIEXPORT jint JNICALL Java_com_leewug_src_diff_DiffUtils_patch(JNIEnv *env, jclass type, jstring oldApkPath_,
                                           jstring newApkPath_, jstring patchPath_) {
    int argc = 4;
    char *ch[argc];
    ch[0] = (char *) "bspatch";
    ch[1] = const_cast<char *>(env->GetStringUTFChars(oldApkPath_, 0));
    ch[2] = const_cast<char *>(env->GetStringUTFChars(newApkPath_, 0));
    ch[3] = const_cast<char *>(env->GetStringUTFChars(patchPath_, 0));
    int ret = applypatch(argc, ch);
    env->ReleaseStringUTFChars(oldApkPath_, ch[1]);
    env->ReleaseStringUTFChars(newApkPath_, ch[2]);
    env->ReleaseStringUTFChars(patchPath_, ch[3]);
    return ret;
}