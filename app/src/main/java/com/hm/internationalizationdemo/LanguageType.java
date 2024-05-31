package com.hm.internationalizationdemo;

/**
 * Created by dumingwei on 2018/5/31 0031.
 */
public enum LanguageType {

    CHINESE("zh-rCN"),
    ENGLISH("en"),
    THAILAND("th"),
    TRANSLATE_CHINESE("zh-rTW");

    private String language;

    LanguageType(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language == null ? "" : language;
    }
}
