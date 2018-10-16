//
// Created by Chea Socheat on 10/12/18.
//

#include <jni.h>
#ifndef _Included_security
#define _Included_security
#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT jstring
Java_com_asvacode_phummusic_shared_manager_NativeManager_getAppName(JNIEnv *env, jobject);

#ifdef __cplusplus
}
#endif
#endif //PHUMMUSIC_SECURITY_H


/*
#ifndef PHUMMUSIC_NATIVE_H
#define PHUMMUSIC_NATIVE_H

#endif //PHUMMUSIC_NATIVE_H
*/


