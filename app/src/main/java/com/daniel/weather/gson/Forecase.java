package com.daniel.weather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecase {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class  Temperature{
        @SerializedName("max")
        public String max;

        @SerializedName("min")
        public String min;
    }

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
