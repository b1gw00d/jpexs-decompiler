/*
 *  Copyright (C) 2010-2014 JPEXS
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jpexs.decompiler.flash.tags;

import com.jpexs.decompiler.flash.SWFInputStream;
import com.jpexs.decompiler.flash.types.annotations.Internal;
import java.io.IOException;

/**
 *
 *
 * @author JPEXS
 */
public class SoundStreamBlockTag extends Tag {

    public static final int ID = 19;

    @Internal
    public byte[] streamSoundData;

    /**
     * Constructor
     *
     * @param sis
     * @param length
     * @param pos
     * @throws IOException
     */
    public SoundStreamBlockTag(SWFInputStream sis, long pos, int length) throws IOException {
        super(sis.getSwf(), ID, "SoundStreamBlock", pos, length);
        //all data is streamSoundData
        streamSoundData = sis.readBytesEx(sis.available());
    }
}