package objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Vacancy {
    @Expose
    String name;
    @Expose
    Salary salary;
    //attantion on @SerializedName he is for sobludenia convensii
    @SerializedName("alternate_url")
    @Expose
    String alternateUrl;
    String additionInfo;
    @Expose
    int id;
}
