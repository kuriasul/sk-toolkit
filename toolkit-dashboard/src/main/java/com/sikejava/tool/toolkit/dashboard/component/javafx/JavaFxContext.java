package com.sikejava.tool.toolkit.dashboard.component.javafx;

import com.sikejava.tool.toolkit.dashboard.component.javafx.splash.SplashScreen;

import org.springframework.context.ApplicationContext;

/**
 * javafx上下文
 *
 * @author skjv2014@163.com
 * @since 2022-08-10 23:51:27
 */
public enum JavaFxContext {
    /**
     * 单实例
     */
    INSTANCE;

    /**
     * 应用class
     */
    private static Class<?> appClass;
    /**
     * 应用参数
     */
    private static String[] appArgs;
    /**
     * 启动画面
     */
    private static SplashScreen splashScreen;
    /**
     * 首页视图
     */
    private static Class<? extends AbstractJavaFxView> indexView;
    /**
     * spring上下文
     */
    private static ApplicationContext applicationContext;

    public static Class<?> getAppClass() {
        return appClass;
    }

    public static void setAppClass(Class<?> appClass) {
        JavaFxContext.appClass = appClass;
    }

    public static String[] getAppArgs() {
        return appArgs;
    }

    public static void setAppArgs(String[] appArgs) {
        JavaFxContext.appArgs = appArgs;
    }

    public static SplashScreen getSplashScreen() {
        return splashScreen;
    }

    public static void setSplashScreen(SplashScreen splashScreen) {
        JavaFxContext.splashScreen = splashScreen;
    }

    public static Class<? extends AbstractJavaFxView> getIndexView() {
        return indexView;
    }

    public static void setIndexView(Class<? extends AbstractJavaFxView> indexView) {
        JavaFxContext.indexView = indexView;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(ApplicationContext applicationContext) {
        JavaFxContext.applicationContext = applicationContext;
    }
}
