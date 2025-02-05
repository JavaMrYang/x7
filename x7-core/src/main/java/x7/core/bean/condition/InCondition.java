/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package x7.core.bean.condition;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


public class InCondition {

    private String property;
    private List<? extends Object> inList;

    @JsonIgnore
    private transient Class clz;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public List<? extends Object> getInList() {
        return inList;
    }

    public void setInList(List<? extends Object> inList) {
        this.inList = inList;
    }

    public Class getClz() {
        return clz;
    }

    public void setClz(Class clz) {
        this.clz = clz;
    }

    public InCondition(){
    }

    public InCondition(String property,List<? extends Object> inList ){
        this.property = property;
        this.inList = inList;
    }

    @Override
    public String toString() {
        return "InCondition{" +
                "property='" + property + '\'' +
                ", inList=" + inList +
                '}';
    }
}