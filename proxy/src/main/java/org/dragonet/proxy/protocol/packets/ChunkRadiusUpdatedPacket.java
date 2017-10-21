package org.dragonet.proxy.protocol.packets;

import org.dragonet.proxy.protocol.PEPacket;
import org.dragonet.proxy.protocol.ProtocolInfo;

/**
 * Created on 2017/10/22.
 */
public class ChunkRadiusUpdatedPacket extends PEPacket {

    public int radius;

    public ChunkRadiusUpdatedPacket() {
    }

    public ChunkRadiusUpdatedPacket(int radius) {
        this.radius = radius;
    }

    @Override
    public int pid() {
        return ProtocolInfo.CHUNK_RADIUS_UPDATED_PACKET;
    }

    @Override
    public void encodePayload() {
        putVarInt(radius);
    }

    @Override
    public void decodePayload() {
        radius = getVarInt();
    }
}
