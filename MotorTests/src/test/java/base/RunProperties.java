package base;

import ru.yandex.qatools.properties.PropertyLoader;
import ru.yandex.qatools.properties.annotations.Property;
import ru.yandex.qatools.properties.annotations.Resource;

@Resource.Classpath("run.properties")
public class RunProperties {
    @Property("mainUrl")
    private String mainUrl;

    @Property("locale")
    private String locale;

    @Property("driver")
    private String driver;

    public RunProperties(){
        PropertyLoader.populate(this);
    }

    public String getMainUrl() {
        return mainUrl;
    }

    public String getLocale() {
        return locale;
    }

    public String getDriver() {
        return driver;
    }
}
