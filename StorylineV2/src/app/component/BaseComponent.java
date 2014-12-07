package app.component;

import org.apache.http.Header;
import org.json.JSONArray;

import com.nostra13.universalimageloader.core.ImageLoader;

import android.app.Application;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.View;

public class BaseComponent extends Application {
	private static BaseComponent component;
	private Context mContext;
	private View view;
	private ListFragment fragment;
	
	public BaseComponent() {
	}

	public static BaseComponent getInstance(BaseComponent component) {
		if (component == null) {
			component = component;
		}

		return component;
	}

	
	@Override
	public void onCreate() {
		super.onCreate();
		mContext = this;
	}

	public void setContext(Context mContext) {
		this.mContext = mContext;
	}
	
	public Context getContext() {
		return mContext;
	}

	public void onSuccessApi(Object object) {
	}
	
	public void onFailureApi(int statusCode, Header[] headers,
			Throwable throwable, JSONArray errorResponse) {
	}
	
	
	

	/**
	 * @return the view , Abraresto.com
	 * created at Sep 2, 2014
	 */
	public View getView() {
		return view;
	}

	/**
	 * @param view the view to set , Abraresto.com
	 * created at Sep 2, 2014
	 */
	public void setView(View view) {
		this.view = view;
	}

	/**
	 * @return the fragment , Abraresto.com
	 * created at Sep 3, 2014
	 */
	public ListFragment getFragment() {
		return fragment;
	}

	/**
	 * @param fragment the fragment to set , Abraresto.com
	 * created at Sep 3, 2014
	 */
	public void setFragment(ListFragment fragment) {
		this.fragment = fragment;
	}


}
