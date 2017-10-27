package io.kamax.matrix.client;

import io.kamax.matrix._MatrixContent;
import io.kamax.matrix._MatrixID;

import java.util.Optional;

public class MatrixRoomUser extends MatrixHttpUser {

    private String name;
    private _MatrixContent avatar;

    public MatrixRoomUser(MatrixClientContext context, _MatrixID mxId, String name, _MatrixContent avatar) {
        super(context, mxId);

        this.name = name;
        this.avatar = avatar;
    }

    @Override
    public Optional<String> getName() {
        if (name != null) {
            return Optional.of(name);
        } else {
            return super.getName();
        }
    }

    @Override
    public Optional<_MatrixContent> getAvatar() {
        if (avatar != null) {
            return Optional.of(avatar);
        } else {
            return super.getAvatar();
        }
    }
}
