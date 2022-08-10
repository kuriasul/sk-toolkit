package com.sikejava.tool.toolkit.dashboard;

import com.sikejava.tool.toolkit.dashboard.component.javafx.AbstractJavaFxApplication;
import com.sikejava.tool.toolkit.dashboard.index.IndexView;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 控制台应用程序
 *
 * @author skjv2014@163.com
 * @since 2022-08-05 20:57:18
 */
@SpringBootApplication
public class DashboardApplication extends AbstractJavaFxApplication {

    public static void main(String[] args) {
        launch(DashboardApplication.class, args, IndexView.class);
    }
}
