package com.amlogic.DTVPlayer;

import android.util.Log;
import android.os.Bundle;
import android.content.Context;
import com.amlogic.tvutil.TVMessage;
import com.amlogic.tvutil.TVConst;
import com.amlogic.tvutil.TVProgram;
import com.amlogic.tvutil.TVProgramNumber;
import com.amlogic.tvactivity.TVActivity;
import com.amlogic.tvutil.TVChannelParams;
import com.amlogic.tvutil.TVScanParams;
import com.amlogic.tvutil.TVConst;

public class DTVSettings{
	private static final String TAG="DTVSettings";
	private DTVActivity mContext=null;

	public DTVSettings(Context context){
		mContext = (DTVActivity)context;
		
	}
	
	public void setTeltextBound(){
		mContext.setConfig("tv:subtitle:margin_left",60);
		mContext.setConfig("tv:subtitle:margin_right",60);
		mContext.setConfig("tv:subtitle:margin_top",60);
		mContext.setConfig("tv:subtitle:margin_bottom",60);
	}
	public boolean getSubtitleStatus(){
		if(mContext.getBooleanConfig("tv:subtitle:enable"))
			return true;
		else 
			return false;
	}

	public void setSubtitleStatus(boolean value){
		mContext.setConfig("tv:subtitle:enable",value);
	}

	public int getScreenMode(){
		return mContext.getIntConfig("tv:dtv:screen_mode");
	}

	public void setScreenMode(int mode){
		mContext.setConfig("tv:dtv:screen_mode",mode);
	}

	public int getAudioTrack(){
		return mContext.getIntConfig("tv:dtv:audio_tarck");
	}

	public void setAudioTrack(int mode){
		mContext.setConfig("tv:dtv:audio_tarck",mode);
	}
	public int getTimeShiftingDuration(){
		return mContext.getIntConfig("tv:dtv:timeshifting_time_long")/1000;	
	}

	public void  setTimeShiftingDuration(int value){
		mContext.setConfig("tv:dtv:timeshifting_time_long",value*1000);
	}
	
	public int getParentalRating(){
		return mContext.getIntConfig("tv:dtv:dtbt:parent_rate");	
	}

	public void setParentalRating(int value){
		mContext.setConfig("tv:dtv:dtbt:parent_rate",value);
	}

	public int getTeletextRegion(){
		return 0;
	}

	public void setTeletextRegion(int value){

	}

	public String getTeletextRegionName(){
		String value = "en";
		return value;
	}

	public void forceParentalRatingCheck(){
		return ;
	}

	public String getPassWord(){
		String password = "0000";
		password = mContext.getStringConfig("tv:dtv:password");
		return password;
	}

	public void setPassWord(String password){
		if(password!=null)
			mContext.setConfig("tv:dtv:password",password);
	}

	public String getAtscAntennaSource(){
		return mContext.getStringConfig("tv:atsc:antenna:source");
	}	

	public void setAtscAntennaSource(String value){
		mContext.setConfig("tv:atsc:antenna:source",value);
	}	

	public void setCheckProgramLock(boolean b){
		mContext.setConfig("tv:check_program_lock",b);
	}

	public String getScanRegion(){
		return mContext.getStringConfig("tv:scan:dtv:region");	
	}
	
	public void factoryReset(){
		mContext.restoreFactorySetting();
	}
}

