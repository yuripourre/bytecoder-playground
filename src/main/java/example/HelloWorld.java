package example;

import de.mirkosertic.bytecoder.api.web.Console;
import de.mirkosertic.bytecoder.api.web.EventListener;
import de.mirkosertic.bytecoder.api.web.HTMLDocument;
import de.mirkosertic.bytecoder.api.web.Window;

/**
 * https://github.com/libgdx/libgdx/blob/master/backends/gdx-backends-gwt/src/com/badlogic/gdx/backends/gwt/DefaultGwtInput.java
 * https://mirkosertic.github.io/Bytecoder/chapter-1/page-1-b/
 *
 * mvn package compile
 * Generates the bytecoder.js file
 */
public class HelloWorld {

    public static void main(String[] args) {
        Window window = Window.window();
        HTMLDocument document = window.document();

        Listener listener = new Listener();

        document.addEventListener("click", listener);
        document.addEventListener("mousemove", listener);
    }

    static class Listener implements EventListener<NativeEvent> {
        @Override
        public void run(NativeEvent event) {
            if ("click".equals(event.getType())) {
                Console console = Console.console();
                console.log("Log: " + event.getType());
            }
            if ("mousemove".equals(event.getType())) {
                Console console = Console.console();
                console.log("Log: " + event.getType());
            }
        }
    }
}
