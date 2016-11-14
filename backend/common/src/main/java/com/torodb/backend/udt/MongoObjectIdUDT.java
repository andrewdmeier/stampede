/*
 * ToroDB - ToroDB-poc: Backend common
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
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.torodb.backend.udt;

import org.jooq.impl.UDTImpl;

import com.torodb.backend.meta.TorodbSchema;
import com.torodb.backend.udt.record.MongoObjectIdRecord;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MongoObjectIdUDT extends UDTImpl<MongoObjectIdRecord> {

	private static final long serialVersionUID = -552117608;

	/**
	 * The singleton instance of <code>torodb.mongo_object_id</code>
	 */
	public static final MongoObjectIdUDT MONGO_OBJECT_ID = new MongoObjectIdUDT();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MongoObjectIdRecord> getRecordType() {
		return MongoObjectIdRecord.class;
	}

	public static final org.jooq.UDTField<MongoObjectIdRecord, Integer> UPPPER = createField("upper", org.jooq.impl.SQLDataType.INTEGER, MONGO_OBJECT_ID);

	public static final org.jooq.UDTField<MongoObjectIdRecord, Integer> MIDDLE = createField("middle", org.jooq.impl.SQLDataType.INTEGER, MONGO_OBJECT_ID);

	public static final org.jooq.UDTField<MongoObjectIdRecord, Integer> LOWER = createField("lower", org.jooq.impl.SQLDataType.INTEGER, MONGO_OBJECT_ID);

	/**
	 * No further instances allowed
	 */
	private MongoObjectIdUDT() {
		super("mongo_object_id", TorodbSchema.TORODB);

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
