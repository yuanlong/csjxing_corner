package com.doucome.corner.biz.core.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import com.doucome.corner.biz.core.utils.DecimalUtils;

public class DecimalTool extends DecimalUtils {

    public static String format(BigDecimal decimal, String pattern) {
        if (decimal == null) {
            return "";
        }
        DecimalFormat f = new DecimalFormat(pattern);
        return f.format(decimal);
    }

    /**
     * ��ʽ���۸�
     * 
     * @param decimal
     * @return
     */
    public static String formatPrice(BigDecimal decimal) {
        return format(decimal, "0.00");
    }

    /**
     * ��ȡ�ٷֱ�
     * 
     * @param decimal
     * @return
     */
    public static String formatRatio(BigDecimal decimal) {
        return format(multiply(decimal, 100), "0.00") + '%';
    }

    /**
     * ��ȡ�ٷֱ�
     * 
     * @param decimal
     * @return
     */
    public static String formatTaobaoRatio(BigDecimal decimal) {
        return format(divide(decimal, 100), "0.00");
    }

    /**
     * ��ȡ�ٷֱ�
     * 
     * @param decimal
     * @return
     */
    public static String formatTaobaoRatio(BigDecimal decimal, String format) {
        return format(divide(decimal, 100), format);
    }

    public static BigDecimal formatTaobaoRate(BigDecimal decimal) {
        return divide(decimal, 100);
    }

    /**
     * ֻ���С��
     * 
     * @param decimal
     * @param pattern
     * @return
     */
    public static String fractionFormat(BigDecimal decimal, String pattern) {
        if (decimal == null) {
            return "";
        }
        DecimalFormat f = new DecimalFormat(pattern);
        f.setMaximumIntegerDigits(0);
        return f.format(decimal);
    }

    public static BigDecimal divide(BigDecimal d1, int decimalStr) {
        if (d1 == null) {
            return new BigDecimal(0);
        }
        return d1.divide(new BigDecimal(decimalStr));
    }

    public static BigDecimal divide(BigDecimal d1, String decimalStr) {
        return d1.divide(new BigDecimal(decimalStr));
    }

    /**
     * createInt
     * 
     * @param str
     * @return
     */
    public static int createInt(String str) {
        if (StringUtils.isBlank(str)) {
            return 0;
        }
        return NumberUtils.createInteger(str);
    }

    public static int createInt(Integer i) {
        if (i == null) {
            return 0;
        }
        return i;
    }

    public static int createInt(Integer i, int defaultVal) {
        if (i == null) {
            return defaultVal;
        }
        return createInt(i);
    }

    /**
     * createInt
     * 
     * @param str
     * @return
     */
    public static int createInt(String str, int defaultVal) {
        if (StringUtils.isBlank(str)) {
            return defaultVal;
        }
        return createInt(str);
    }

    /**
     * multiply
     * 
     * @param d1
     * @param d2
     * @return
     */
    public static BigDecimal multiply(BigDecimal d1, int d2) {
        if (d1 == null) {
            return null;
        }
        return d1.multiply(new BigDecimal(d2));
    }
}