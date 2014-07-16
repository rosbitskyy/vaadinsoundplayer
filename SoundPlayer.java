package ua.pp.rrs.common;

import com.vaadin.ui.JavaScript;

import java.net.URL;

/**
 * Created by Ruslan Rosbitskyy on 16.07.14.
 * rosbitskyy@gmail.com
 */
public class SoundPlayer {

    public static void play(URL url) {
        String script = "if (document.getElementById('" + url.hashCode() + "') == null) {" +
                "var audio = document.createElement('audio');" +
                "audio.class = 'hidden';" +
                "audio.preload = 'auto';" +
                "audio.id = '" + url.hashCode() + "';" +
                "audio.src = '" + url.toString() + "';" +
                "document.body.appendChild(audio);" +
                "}" +
                "document.getElementById('" + url.hashCode() + "').play();";
        JavaScript.getCurrent().execute(script);
    }

}
