package com.example.horizontalscrollview;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	private ClubsHorizonScrollView mClubsHorizonScrollView;
	private ArrayList<ClubsItemModel> mClubsItemModelList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mClubsHorizonScrollView = (ClubsHorizonScrollView)findViewById(R.id.clubs_horizon_scrollview);
		mClubsItemModelList = new ArrayList<ClubsItemModel>();
		for (int i = 0; i < 5; i++) {
			ClubsItemModel clubsItemModel = new ClubsItemModel();
			clubsItemModel.setClubImagePath("http://images.csdn.net/20130609/zhuanti.jpg");
			clubsItemModel.setClubTitle("title" + i);
			clubsItemModel.setClubNum("num" + i);
			mClubsItemModelList.add(clubsItemModel);
		}
		mClubsHorizonScrollView.setListData(mClubsItemModelList);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container, false);
			return rootView;
		}
	}

}
