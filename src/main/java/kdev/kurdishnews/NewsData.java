package kdev.kurdishnews;

import java.util.ArrayList;

/**
 * Created by reba on 2/27/18.
 */

public class NewsData {

    NewsData(){}

    public ArrayList<NewsModel> getNewsData(){
        ArrayList<NewsModel> models = new ArrayList<>();

        models.add(new NewsModel(1,R.drawable.i1,"Apple is creating medical clinics to offer employees healthcare and test products","Apple is preparing to open medical clinics to provide healthcare for its employees and their families in Cupertino this spring, according to a new report by CNBC. The tech company has launched a website for the clinics, which will operate under the name AC Wellness. "));
        models.add(new NewsModel(2,R.drawable.i3,"Sony’s new A7 III is a $2,000 full-frame mirrorless camera that should terrify Canon and Nikon","Sony spent 2017 releasing pricey powerhouse cameras like the A9, but today the company announced one that sounds almost as good at half the price. The new full-frame A7 III splits the difference between the pixel-packed A7R III and the A7S II, the company’s low light and video king. It boasts big-time speed and just about everything else you could ask for, all for $1,999 (body only) when it ships in April."));
        models.add(new NewsModel(3,R.drawable.i6, "EU says 'massacre' in Syria's Eastern Ghouta 'must stop now'","EU foreign policy chief Federica Mogherini called for an immediate ceasefire and aid deliveries in the rebel-held Syrian enclave of Eastern Ghouta after more than 400 civilians were killed there."));
        models.add(new NewsModel(3,R.drawable.i2,"The Galaxy S9’s dual-aperture camera is great marketing","Samsung’s Galaxy S9 launch event here at Mobile World Congress 2018 was a weird one. The company went through familiar motions, but the usual buzz and excitement for its new flagship phone weren’t really there."));
        models.add(new NewsModel(5,R.drawable.i4, "Turkey condemns Czech release of Syrian Kurd leader","Turkey on Tuesday (February 27) accused the Czech judicial authorities of backing “terror” after the release of prominent Syrian Kurdish leader Salih Muslim, warning that ties between Ankara and Prague would be harmed."));
        models.add(new NewsModel(6,R.drawable.i5, "Iraqi dinar exchange rates (February 27)","The U.S. dollar to Iraqi dinar (IQD) exchange rate remained down in the Kurdistan Region’s currency markets on Tuesday (February 27)."));
        models.add(new NewsModel(7,R.drawable.i7, "Iraq extends air blockade of Kurdistan by three months: airport official","Iraq has extended by three months a ban on international flights to the Kurdistan Region, a senior official at Erbil airport in the capital of Kurdistan said on Monday (February 26)."));
        models.add(new NewsModel(8,R.drawable.i2,"The Galaxy S9’s dual-aperture camera is great marketing","Samsung’s Galaxy S9 launch event here at Mobile World Congress 2018 was a weird one. The company went through familiar motions, but the usual buzz and excitement for its new flagship phone weren’t really there."));
        models.add(new NewsModel(9,R.drawable.i3,"Sony’s new A7 III is a $2,000 full-frame mirrorless camera that should terrify Canon and Nikon","Sony spent 2017 releasing pricey powerhouse cameras like the A9, but today the company announced one that sounds almost as good at half the price. The new full-frame A7 III splits the difference between the pixel-packed A7R III and the A7S II, the company’s low light and video king. It boasts big-time speed and just about everything else you could ask for, all for $1,999 (body only) when it ships in April."));
        models.add(new NewsModel(10,R.drawable.i4, "Turkey condemns Czech release of Syrian Kurd leader","Turkey on Tuesday (February 27) accused the Czech judicial authorities of backing “terror” after the release of prominent Syrian Kurdish leader Salih Muslim, warning that ties between Ankara and Prague would be harmed."));
        models.add(new NewsModel(11,R.drawable.i5, "Iraqi dinar exchange rates (February 27)","The U.S. dollar to Iraqi dinar (IQD) exchange rate remained down in the Kurdistan Region’s currency markets on Tuesday (February 27)."));
        models.add(new NewsModel(12,R.drawable.i6, "EU says 'massacre' in Syria's Eastern Ghouta 'must stop now'","EU foreign policy chief Federica Mogherini called for an immediate ceasefire and aid deliveries in the rebel-held Syrian enclave of Eastern Ghouta after more than 400 civilians were killed there."));
        models.add(new NewsModel(13,R.drawable.i4, "Turkey condemns Czech release of Syrian Kurd leader","Turkey on Tuesday (February 27) accused the Czech judicial authorities of backing “terror” after the release of prominent Syrian Kurdish leader Salih Muslim, warning that ties between Ankara and Prague would be harmed."));
        models.add(new NewsModel(14,R.drawable.i5, "Iraqi dinar exchange rates (February 27)","The U.S. dollar to Iraqi dinar (IQD) exchange rate remained down in the Kurdistan Region’s currency markets on Tuesday (February 27)."));

        return models;
    }

}
