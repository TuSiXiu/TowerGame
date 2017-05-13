package com.xqs.mypaoku.stage;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.xqs.mypaoku.MyPaokuGame;
import com.xqs.mypaoku.actor.SoundHelper;
import com.xqs.mypaoku.actor.level.BackButton;
import com.xqs.mypaoku.actor.level.LevelBg;
import com.xqs.mypaoku.actor.level.LevelIcon;
import com.xqs.mypaoku.res.Constant;
import com.xqs.mypaoku.stage.base.BaseStage;
import com.xqs.mypaoku.util.Util;

/**
 * Created by Administrator on 2017/4/12 0012.
 */

public class LevelStage extends BaseStage {
    public static final String TAG = "LevelStage";

    private LevelBg levelBg;
    private BackButton backButton;

    private LevelIcon levelIcon01;
    private LevelIcon levelIcon02;
    private LevelIcon levelIcon03;
    private LevelIcon levelIcon04;
    private LevelIcon levelIcon05;
    private LevelIcon levelIcon06;
    private LevelIcon levelIcon07;
    private LevelIcon levelIcon08;
    private LevelIcon levelIcon09;

    private int initX;

    public LevelStage(MyPaokuGame mainGame, Viewport viewport){
        super(mainGame,viewport);

        levelBg = new LevelBg(mainGame);
        addActor(levelBg);

        backButton = new BackButton(mainGame);
        addActor(backButton);

        // 初始x
        initX = (int) mainGame.getWorldWidth()/2 - 600/2;

        initLevelIcon();

        setClick();
    }

    @Override
    public void orderAct(float delta, int counter) {

    }

    private void initLevelIcon() {
        levelIcon01 = new LevelIcon(getMainGame(),1);
        levelIcon01.setPosition(initX,550);
        levelIcon02 = new LevelIcon(getMainGame(),2);
        levelIcon02.setPosition(initX+200,550);
        levelIcon03 = new LevelIcon(getMainGame(),3);
        levelIcon03.setPosition(initX+400,550);
        levelIcon04 = new LevelIcon(getMainGame(),4);
        levelIcon04.setPosition(initX,400);
        levelIcon05 = new LevelIcon(getMainGame(),5);
        levelIcon05.setPosition(initX+200,400);
        levelIcon06 = new LevelIcon(getMainGame(),6);
        levelIcon06.setPosition(initX+400,400);
        levelIcon07 = new LevelIcon(getMainGame(),7);
        levelIcon07.setPosition(initX,250);
        levelIcon08 = new LevelIcon(getMainGame(),8);
        levelIcon08.setPosition(initX+200,250);
        levelIcon09 = new LevelIcon(getMainGame(),9);
        levelIcon09.setPosition(initX+400,250);


        addActor(levelIcon01);
        addActor(levelIcon02);
        addActor(levelIcon03);
        addActor(levelIcon04);
        addActor(levelIcon05);
        addActor(levelIcon06);
        addActor(levelIcon07);
        addActor(levelIcon08);
        addActor(levelIcon09);
    }

    private void setClick() {
        backButton.addListener(new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                SoundHelper.playButtonSound();
                getMainGame().showMenuScreen(Constant.SCREEN_LEVEL);
            }
        });
    }

}
