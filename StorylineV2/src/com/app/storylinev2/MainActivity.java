package com.app.storylinev2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import app.fragment.BaseFragment;
import app.fragment.TimelineFragment;

public class MainActivity extends ActionBarActivity {

	private TimelineFragment timeLine;

	// private String[] mMenuItems;
	// private DrawerLayout mDrawerLayout;
	// private ListView mDrawerList;
	// private ActionBarDrawerToggle mDrawerToggle;

	// @Override
	// protected void onCreate(Bundle savedInstanceState) {
	// super.onCreate(savedInstanceState);
	// setContentView(R.layout.activity_main);
	//
	// // if (savedInstanceState == null) {
	// // getFragmentManager().beginTransaction()
	// // .add(R.id.container, new PlaceholderFragment()).commit();
	// // }

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		timeLine = (TimelineFragment) BaseFragment
				.getInstance(TimelineFragment.class);
		getSupportFragmentManager().beginTransaction()
				.add(R.id.content_frame, timeLine).commit();

		// mMenuItems = new String[] { "one", "two", "three" };
		// mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		// mDrawerList = (ListView) findViewById(R.id.left_drawer);
		//
		// // Set the adapter for the list view
		// mDrawerList.setAdapter(new ArrayAdapter<String>(this,
		// R.layout.drawer_item, mMenuItems));
		// // Set the list's click listener
		// mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
		//
		// mDrawerToggle = new ActionBarDrawerToggle(this, /* host Activity */
		// mDrawerLayout, /* DrawerLayout object */
		// R.drawable.ic_drawer, /* nav drawer icon to replace 'Up' caret */
		// R.string.drawer_open, /* "open drawer" description */
		// R.string.drawer_close /* "close drawer" description */
		// ) {
		//
		// /** Called when a drawer has settled in a completely closed state. */
		// public void onDrawerClosed(View view) {
		// getActionBar().setTitle("Closed");
		// }
		//
		// /** Called when a drawer has settled in a completely open state. */
		// public void onDrawerOpened(View drawerView) {
		// getActionBar().setTitle("Open");
		// }
		// };
		//
		// // Set the drawer toggle as the DrawerListener
		// mDrawerLayout.setDrawerListener(mDrawerToggle);
		// getSupportActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	// @Override
	// protected void onPostCreate(Bundle savedInstanceState) {
	// super.onPostCreate(savedInstanceState);
	// // Sync the toggle state after onRestoreInstanceState has occurred.
	// mDrawerToggle.syncState();
	// }
	//
	// @Override
	// public void onConfigurationChanged(Configuration newConfig) {
	// super.onConfigurationChanged(newConfig);
	// mDrawerToggle.onConfigurationChanged(newConfig);
	// }
	//
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		return super.onOptionsItemSelected(item);
	}
	//
	// /**
	// * Swaps fragments in the main content view
	// */
	// private void selectItem(int position) {
	// Toast.makeText(this, R.string.app_name, Toast.LENGTH_SHORT).show();
	//
	// // Highlight the selected item, update the title, and close the drawer
	// mDrawerList.setItemChecked(position, true);
	// setTitle(mMenuItems[position]);
	// mDrawerLayout.closeDrawer(mDrawerList);
	// }
	//
	// @Override
	// public void setTitle(CharSequence title) {
	// getSupportActionBar().setTitle(title);
	// }
	//
	// private class DrawerItemClickListener implements
	// ListView.OnItemClickListener {
	// @Override
	// public void onItemClick(AdapterView parent, View view, int position,
	// long id) {
	// selectItem(position);
	// }
	// }

}
