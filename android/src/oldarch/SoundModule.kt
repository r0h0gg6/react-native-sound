package com.zmxv.RNSound;

import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.bridge.ReactMethod

class SoundModule internal constructor(context: ReactApplicationContext) :
  ReactContextBaseJavaModule(context) {
  private var module = Sound(context)

  @ReactMethod
  fun prepare(fileName: String, key: Double, options: ReadableMap, callback: Callback) {
    module.prepare(fileName,key,options,callback)
  }
  @ReactMethod
  fun setCategory(value: String, mixWithOthers: Boolean) {
    module.setCategory(value,mixWithOthers)
  }
  @ReactMethod
  fun play(key: Double, callback: Callback) {
    module.play(key,callback)
  }
  @ReactMethod
  fun pause(key: Double, callback: Callback) {
    module.pause(key,callback)
  }
  @ReactMethod
  fun stop(key: Double, callback: Callback) {
    module.stop(key,callback)
  }
  @ReactMethod
  fun reset(key: Double) {
    module.reset(key)
  }
  @ReactMethod
  fun release(key: Double) {
    module.release(key)
  }
  @ReactMethod
  fun setVolume(key: Double, left: Double, right: Double) {
    module.setVolume(key,left.toFloat(),right.toFloat())
  }
  @ReactMethod
  fun getSystemVolume(callback: Callback) {
    module.getSystemVolume(callback)
  }

  @ReactMethod
  fun setLooping(key: Double, looping: Boolean) {
    module.setLooping(key,looping)
  }

  @ReactMethod
  fun setSpeed(key: Double, speed: Double) {
    module.setSpeed(key,speed.toFloat())
  }
  @ReactMethod
  fun setPitch(key: Double, pitch: Double) {
    module.setPitch(key,pitch.toFloat())
  }
  @ReactMethod
  fun setCurrentTime(key: Double, sec: Double) {
    module.setCurrentTime(key,sec.toFloat())
  }
  @ReactMethod
  fun getCurrentTime(key: Double, callback: Callback) {
    module.getCurrentTime(key,callback)
  }
  @ReactMethod
  fun setSpeakerphoneOn(key: Double, speaker: Boolean) {
    module.setSpeakerphoneOn(key,speaker)
  }
  @ReactMethod
  fun setSystemVolume(value: Double) {
    module.setSystemVolume(value.toFloat())
  }

  @ReactMethod
  fun addListener(eventName: String){
    // Keep: Needed for RN built in Event Emitter Calls
  }

  @ReactMethod
  fun removeListeners(count: Double){
    // Keep: Needed for RN built in Event Emitter Calls
  }

  override fun getName(): String {
    return NAME
  }

  companion object {
    const val NAME = "RNSound"
  }
}
