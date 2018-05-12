package cafecod.com.barfind.domain;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.android.gms.internal.zzdwf;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseUserMetadata;
import com.google.firebase.auth.UserInfo;

import java.util.List;

public class ExtendedUserInfo extends FirebaseUser {
    Integer type;

    public ExtendedUserInfo(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }


    @NonNull
    @Override
    public String getUid() {
        return null;
    }

    @NonNull
    @Override
    public String getProviderId() {
        return null;
    }

    @Override
    public boolean isAnonymous() {
        return false;
    }

    @Nullable
    @Override
    public List<String> getProviders() {
        return null;
    }

    @NonNull
    @Override
    public List<? extends UserInfo> getProviderData() {
        return null;
    }

    @NonNull
    @Override
    public FirebaseUser zzap(@NonNull List<? extends UserInfo> list) {
        return null;
    }

    @Override
    public FirebaseUser zzcc(boolean b) {
        return null;
    }

    @NonNull
    @Override
    public FirebaseApp zzbpn() {
        return null;
    }

    @Nullable
    @Override
    public String getDisplayName() {
        return null;
    }

    @Nullable
    @Override
    public Uri getPhotoUrl() {
        return null;
    }

    @Nullable
    @Override
    public String getEmail() {
        return null;
    }

    @Nullable
    @Override
    public String getPhoneNumber() {
        return null;
    }

    @Override
    public boolean isEmailVerified() {
        return false;
    }

    @NonNull
    @Override
    public zzdwf zzbpo() {
        return null;
    }

    @Override
    public void zza(@NonNull zzdwf zzdwf) {

    }

    @NonNull
    @Override
    public String zzbpp() {
        return null;
    }

    @NonNull
    @Override
    public String zzbpq() {
        return null;
    }

    @Nullable
    @Override
    public FirebaseUserMetadata getMetadata() {
        return null;
    }
}
