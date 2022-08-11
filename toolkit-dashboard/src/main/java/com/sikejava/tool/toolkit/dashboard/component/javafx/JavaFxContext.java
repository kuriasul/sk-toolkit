package com.sikejava.tool.toolkit.dashboard.component.javafx;

import com.sikejava.tool.toolkit.dashboard.component.javafx.view.AbstractFxmlView;
import com.sikejava.tool.toolkit.dashboard.component.javafx.view.SimpleView;

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
    private static SimpleView bootView;
    /**
     * 首页视图
     */
    private static Class<? extends AbstractFxmlView> indexView;
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

    public static SimpleView getBootView() {
        return bootView;
    }

    public static void setBootView(SimpleView bootView) {
        JavaFxContext.bootView = bootView;
    }

    public static Class<? extends AbstractFxmlView> getIndexView() {
        return indexView;
    }

    public static void setIndexView(Class<? extends AbstractFxmlView> indexView) {
        JavaFxContext.indexView = indexView;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static void setApplicationContext(ApplicationContext applicationContext) {
        JavaFxContext.applicationContext = applicationContext;
    }
}
