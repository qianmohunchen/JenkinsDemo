package cn.segi.demo.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import cn.segi.demo.mvp.adapter.GirlAdapter;
import cn.segi.demo.mvp.bean.Girl;
import cn.segi.demo.mvp.presenter.GrilPresenter;
import cn.segi.demo.mvp.view.IGirlView;

public class MainActivity extends AppCompatActivity implements IGirlView {


    private ListView listView;

    private TextView flavorTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        flavorTv = findViewById(R.id.flavor_tv);
        VariantUtil.setTxt(flavorTv);
        new GrilPresenter(this).fetch();
    }

    @Override
    public void showGirls(List<Girl> girlList) {
        listView.setAdapter(new GirlAdapter(this, girlList));
    }
}
