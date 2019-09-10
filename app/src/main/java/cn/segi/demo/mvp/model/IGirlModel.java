package cn.segi.demo.mvp.model;

import java.util.List;

import cn.segi.demo.mvp.bean.Girl;

public interface IGirlModel {

    void loadGirl(IGrilLoadListener iGrilLoadListener);

    interface IGrilLoadListener {
        void complete(List<Girl> girls);
    }
}
