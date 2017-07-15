package com.xzgl.www.util;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lzc on 17-7-7.
 */
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        String pattern;
        if (source.length() <10) {
            String[] tmp = source.split("-");
            if (tmp[1].length() == 1){
                if (tmp[2].length() == 1) {
                    pattern = "yyyy-M-d";
                } else {
                    pattern = "yyyy-M-dd";
                }
            } else {
                pattern = "yyyy-MM-d";
            }
        } else {
            pattern = source.length()==10 ? "yyyy-MM-dd" : "yyyy-MM-dd HH:mm:ss";
        }

        SimpleDateFormat format = new SimpleDateFormat(pattern);
        try {
            return format.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
