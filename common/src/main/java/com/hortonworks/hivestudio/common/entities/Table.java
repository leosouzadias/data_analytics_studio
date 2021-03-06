/*
 *
 * HORTONWORKS DATAPLANE SERVICE AND ITS CONSTITUENT SERVICES
 *
 * (c) 2016-2018 Hortonworks, Inc. All rights reserved.
 *
 * This code is provided to you pursuant to your written agreement with Hortonworks, which may be the terms of the
 * Affero General Public License version 3 (AGPLv3), or pursuant to a written agreement with a third party authorized
 * to distribute this code.  If you do not have a written agreement with Hortonworks or with an authorized and
 * properly licensed third party, you do not have any rights to this code.
 *
 * If this code is provided to you under the terms of the AGPLv3:
 * (A) HORTONWORKS PROVIDES THIS CODE TO YOU WITHOUT WARRANTIES OF ANY KIND;
 * (B) HORTONWORKS DISCLAIMS ANY AND ALL EXPRESS AND IMPLIED WARRANTIES WITH RESPECT TO THIS CODE, INCLUDING BUT NOT
 *   LIMITED TO IMPLIED WARRANTIES OF TITLE, NON-INFRINGEMENT, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE;
 * (C) HORTONWORKS IS NOT LIABLE TO YOU, AND WILL NOT DEFEND, INDEMNIFY, OR HOLD YOU HARMLESS FOR ANY CLAIMS ARISING
 *   FROM OR RELATED TO THE CODE; AND
 * (D) WITH RESPECT TO YOUR EXERCISE OF ANY RIGHTS GRANTED TO YOU FOR THE CODE, HORTONWORKS IS NOT LIABLE FOR ANY
 *   DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, PUNITIVE OR CONSEQUENTIAL DAMAGES INCLUDING, BUT NOT LIMITED TO,
 *   DAMAGES RELATED TO LOST REVENUE, LOST PROFITS, LOSS OF INCOME, LOSS OF BUSINESS ADVANTAGE OR UNAVAILABILITY,
 *   OR LOSS OR CORRUPTION OF DATA.
 *
 */
package com.hortonworks.hivestudio.common.entities;


import java.util.Date;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.hortonworks.hivestudio.common.repository.Identifiable;

import lombok.Data;

@Data
public class Table implements Identifiable<Integer> {

  private Integer id;
  private Integer dbId;

  private String name;
  private String owner;

  private Date createTime;
  private Date lastAccessTime;

  private ParsedTableType parsedTableType; // NORMAL / TEMP /INTERMEDIATE

  private String tableType; // MANAGED / EXTERNAL
  private String location;
  private String serde;

  private String inputFormat;
  private String outputFormat;

  private Boolean compressed;
  private Boolean dropped;

  private Integer numBuckets;

  private String comment;

  private Date droppedAt;
  private Date lastUpdatedAt;

  private ObjectNode properties;
  private ObjectNode storageParameters;

  private CreationSource creationSource;  // EVENT_PROCESSOR / REPLICATION_SYNC

  private Integer retention;

  /**
   * @param name : converts the name to lower case and sets
   * @throws  NullPointerException if name is null.
   */
  public void setName(String name) {
    this.name = name.toLowerCase();
  }
}
