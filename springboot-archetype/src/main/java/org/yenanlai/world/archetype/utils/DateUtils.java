package org.yenanlai.world.archetype.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.util.ObjectUtils;

import lombok.extern.slf4j.Slf4j;

/**
 * 日期工具类
 */
@Slf4j
public class DateUtils {

    public static String dateHandler(Date date) {
        if (ObjectUtils.isEmpty(date)) return null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }

    public static String datetimeHandler(Date date) {
        if (ObjectUtils.isEmpty(date)) return null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }

    public static Date getDate(Date date, int day) {
        if (ObjectUtils.isEmpty(date)) return null;
        Calendar now = Calendar.getInstance();
        now.setTime(date);
        now.set(Calendar.DATE, now.get(Calendar.DATE) + day);
        return now.getTime();
    }

}
