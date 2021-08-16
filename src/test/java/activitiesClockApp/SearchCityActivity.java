package activitiesClockApp;

import controlAppium.ElementList;
import controlAppium.TextBox;
import org.openqa.selenium.By;

public class SearchCityActivity {

    public TextBox searchTextBox = new TextBox(By.id("com.google.android.deskclock:id/search_src_text"));
    public ElementList elementListSearch = new ElementList(By.xpath("//android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]"));

}
