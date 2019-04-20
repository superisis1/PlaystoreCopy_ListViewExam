package kr.insungjung.playstorecopy_listviewexam.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import kr.insungjung.playstorecopy_listviewexam.R;
import kr.insungjung.playstorecopy_listviewexam.datas.App;

public class AppAdapter extends ArrayAdapter<App> {

    Context mContext;
    List<App> mList;
    LayoutInflater inf;

    public AppAdapter(Context context, List<App> list) {
        super(context, R.layout.app_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if(row == null) {
            row = inf.inflate(R.layout.app_list_item, null);
        }

        App appData = mList.get(position);

        TextView appTitleTxt = row.findViewById(R.id.appTitleTxt);
        TextView appCompanyTxt = row.findViewById(R.id.appCompanyTxt);
        TextView appInstallTxt = row.findViewById(R.id.appInstallTxt);

        appTitleTxt.setText(String.format("%d. %s",appData.appTitleNum, appData.appTitle));
        appCompanyTxt.setText(appData.appCompany);
        appInstallTxt.setText(appData.appInstall);

        return row;
    }
}
