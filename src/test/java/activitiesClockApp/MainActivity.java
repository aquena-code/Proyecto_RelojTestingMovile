package activitiesClockApp;

import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;

public class MainActivity {
    public Button clockMenuButtom = new Button(By.id("com.google.android.deskclock:id/tab_menu_clock"));
    public Button cityAddButton = new Button(By.id("com.google.android.deskclock:id/fab"));
    public Label cityCreated = new Label(By.id("com.google.android.deskclock:id/city_name"));
    //public Label containerList = new Label(By.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView"));

    //public Label elementOne = new Label(By.xpath("android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/android.widget.FrameLayout/android.view.View/android.widget.LinearLayout[2]"));
}
