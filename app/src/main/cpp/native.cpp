#include <jni.h>
#include <string>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <iostream>
#include <fstream>
#include "native.h"

JNIEXPORT jstring JNICALL
Java_com_asvacode_phummusic_manager_NativeManager_getAppName(JNIEnv *env, jobject) {
    std::string appName = "Phum Music";
    return env->NewStringUTF(appName.c_str());
}
