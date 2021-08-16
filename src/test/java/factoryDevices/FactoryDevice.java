package factoryDevices;

public class FactoryDevice {


    public enum DeviceTyPe{
        ANDROID,
        IOS
    }

    public static IDevice make(DeviceTyPe tipo){
        IDevice device = null;

        switch (tipo){
            case ANDROID:
                device = new Android();
                break;
            case IOS:
                device = new IOS();
                break;
            default:
                device = new Android();
                break;
        }
        return device;
    }
}
