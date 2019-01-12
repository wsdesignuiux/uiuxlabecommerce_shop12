package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.Viewpagerscreen11;

/**
 * Created by wolfsoft4 on 22/12/18.
 */

public class Viewpagerscreen11Adapter extends FragmentStatePagerAdapter {
    public Viewpagerscreen11Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                Viewpagerscreen11 tab1 = new Viewpagerscreen11();
                return tab1;
            case 1:
                Viewpagerscreen11 tab2 = new Viewpagerscreen11();
                return tab2;
            case 2:
                Viewpagerscreen11 tab3 = new Viewpagerscreen11();
                return tab3;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
