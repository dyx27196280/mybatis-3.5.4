/**
 *    Copyright 2009-2021 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.submitted.lazyload_common_property;

public class Child {
    private Integer id;
    private String name;
    private Father father;
    private GrandFather grandFather;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Father getFather() {
        return father;
    }
    public void setFather(Father father) {
        this.father = father;
    }
    public GrandFather getGrandFather() {
        return grandFather;
    }
    public void setGrandFather(GrandFather grandFather) {
        this.grandFather = grandFather;
    }
}
