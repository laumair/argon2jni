package de.wuthoehle.argon2jni;
/*
 * Copyright (c) Marco Huenseler
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

public final class SecurityParameters {
    public static final class SecurityParameterTemplates {
        public static final int T_COST = 3;
        public static final int M_COST = 1 << 12;
        public static final int PARALLELISM = 1;
    }

    public int t_cost, m_cost, parallelism;

    public SecurityParameters() {
        this.t_cost = SecurityParameterTemplates.T_COST;
        this.m_cost = SecurityParameterTemplates.M_COST;
        this.parallelism = SecurityParameterTemplates.PARALLELISM;
    }

    public SecurityParameters(int t_cost, int m_cost, int parallelism) {
        this.t_cost = t_cost;
        this.m_cost = m_cost;
        this.parallelism = parallelism;
    }
}
