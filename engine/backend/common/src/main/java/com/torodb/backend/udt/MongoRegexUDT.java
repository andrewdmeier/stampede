/*
 * ToroDB
 * Copyright © 2014 8Kdata Technology (www.8kdata.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.torodb.backend.udt;

import com.torodb.backend.meta.TorodbSchema;
import com.torodb.backend.udt.record.MongoTimestampRecord;
import org.jooq.impl.UDTImpl;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = {"http://www.jooq.org", "3.4.1"},
    comments = "This class is generated by jOOQ")
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class MongoTimestampUDT extends UDTImpl<MongoTimestampRecord> {

  public static final String IDENTIFIER = "mongo_timestamp";

  private static final long serialVersionUID = -552117608;

  /**
   * The singleton instance of <code>torodb.mongo_timestamp</code>
   */
  public static final MongoTimestampUDT MONGO_TIMESTAMP = new MongoTimestampUDT();

  /**
   * The class holding records for this type
   */
  @Override
  public Class<MongoTimestampRecord> getRecordType() {
    return MongoTimestampRecord.class;
  }

  /**
   * The attribute <code>torodb.mongo_timestap.upper</code>.
   */
  public static final org.jooq.UDTField<MongoTimestampRecord, Integer> SECS = createField("secs",
      org.jooq.impl.SQLDataType.INTEGER, MONGO_TIMESTAMP);

  /**
   * The attribute <code>torodb.mongo_timestap.middle</code>.
   */
  public static final org.jooq.UDTField<MongoTimestampRecord, Integer> COUNTER = createField(
      "counter", org.jooq.impl.SQLDataType.INTEGER, MONGO_TIMESTAMP);

  /**
   * No further instances allowed
   */
  private MongoTimestampUDT() {
    super(IDENTIFIER, TorodbSchema.TORODB);

    // Initialise data type
    getDataType();
  }

  @Override
  public boolean equals(Object that) {
    return super.equals(that);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

}
