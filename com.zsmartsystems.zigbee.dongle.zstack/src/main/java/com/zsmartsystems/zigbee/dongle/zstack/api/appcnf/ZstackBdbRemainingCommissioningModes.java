/**
 * Copyright (c) 2016-2019 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.zstack.api.appcnf;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to implement the Z-Stack Enumeration <b>ZstackBdbRemainingCommissioningModes</b>.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson
 */
public enum ZstackBdbRemainingCommissioningModes {
    /**
     * Default unknown value
     */
    UNKNOWN(-1),

    /**
     *
     */
    BDB_COMMISSIONING_MODE_INITIATOR_TL(0x0001),

    /**
     *
     */
    BDB_COMMISSIONING_MODE_NWK_STEERING(0x0002),

    /**
     *
     */
    BDB_COMMISSIONING_MODE_NWK_FORMATION(0x0004),

    /**
     *
     */
    BDB_COMMISSIONING_MODE_FINDING_BINDING(0x0008),

    /**
     *
     */
    BDB_COMMISSIONING_MODE_INITIALIZATION(0x0010),

    /**
     *
     */
    BDB_COMMISSIONING_MODE_PARENT_LOST(0x0020);

    /**
     * A mapping between the integer code and its corresponding type to
     * facilitate lookup by code.
     */
    private static Map<Integer, ZstackBdbRemainingCommissioningModes> codeMapping;

    private int key;

    static {
        codeMapping = new HashMap<Integer, ZstackBdbRemainingCommissioningModes>();
        for (ZstackBdbRemainingCommissioningModes s : values()) {
            codeMapping.put(s.key, s);
        }
    }

    private ZstackBdbRemainingCommissioningModes(int key) {
        this.key = key;
    }

    /**
     * Lookup function based on the type code. Returns null if the code does not exist.
     *
     * @param code the code to lookup
     * @return enumeration value of the alarm type.
     */
    public static ZstackBdbRemainingCommissioningModes valueOf(int code) {
        if (codeMapping.get(code) == null) {
            return UNKNOWN;
        }

        return codeMapping.get(code);
    }

    /**
     * Returns the Z-Stack protocol defined value for this enumeration.
     *
     * @return the Z-Stack protocol key
     */
    public int getKey() {
        return key;
    }
}
