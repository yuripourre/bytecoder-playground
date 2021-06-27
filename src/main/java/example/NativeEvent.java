package example;

import de.mirkosertic.bytecoder.api.OpaqueProperty;
import de.mirkosertic.bytecoder.api.web.Event;

public interface NativeEvent extends Event {

    @OpaqueProperty
    String getType();

}
