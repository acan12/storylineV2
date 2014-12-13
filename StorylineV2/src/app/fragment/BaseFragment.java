package app.fragment;



import java.lang.reflect.InvocationTargetException;

import android.support.v4.app.Fragment;

public class BaseFragment extends Fragment {
	private String backFragmentTag = "";
	private static Object object;
	
	@SuppressWarnings("null")
	public static Object getInstance(Class<?> clazz){
		
		if(object == null){
			try {
				object = clazz.newInstance();
				
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (java.lang.InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		return object;
	}
	
	
	
	
	@Override
	public void onStart()
	{
		super.onStart();
//		FlurryAgent.onStartSession(getActivity(), Consts.FLURRY_KEY);
	}
	 
	@Override
	public void onStop()
	{
		super.onStop();		
//		FlurryAgent.onEndSession(getActivity());
	}
	
	public void setBackFragmentTag(String tag){
		this.backFragmentTag = tag;
	}
	
	public String getBackFragmentTag(){
		return this.backFragmentTag;
	}
}
