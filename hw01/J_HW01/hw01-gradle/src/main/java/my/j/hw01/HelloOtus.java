package my.j.hw01;
import com.google.common.base.MoreObjects;
//import com.google.common.base.MoreObjects.ToStringHelper;
public class HelloOtus {
    private String lastName;
    private String middleName;
    private String firstName;
    public HelloOtus() {
        String undef="unknown";
        lastName= undef;
        middleName=undef;
        firstName=undef;
    }
    public HelloOtus(String ln, String mn, String fn) {

        lastName= ln;
        middleName= mn;
        firstName= fn;
    }


@Override
    public String toString() {
    return MoreObjects.toStringHelper(this)
            .omitNullValues()
            .add("firstName", firstName)
            .add("middleName", middleName)
            .add("lastName", lastName)
            .toString();
    }
}
