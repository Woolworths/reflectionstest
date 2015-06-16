package com.example;

import java.io.Serializable;

public interface DBDriver extends Serializable {
    String getPrefix();
}