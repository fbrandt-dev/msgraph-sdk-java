package microsoft.graph.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/** Provides operations to manage the collection of agreementAcceptance entities. */
public enum CrossTenantAccessPolicyTargetConfigurationAccessType implements ValuedEnum {
    Allowed("allowed"),
    Blocked("blocked"),
    UnknownFutureValue("unknownFutureValue");
    public final String value;
    CrossTenantAccessPolicyTargetConfigurationAccessType(final String value) {
        this.value = value;
    }
    @javax.annotation.Nonnull
    public String getValue() { return this.value; }
    @javax.annotation.Nullable
    public static CrossTenantAccessPolicyTargetConfigurationAccessType forValue(@javax.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "allowed": return Allowed;
            case "blocked": return Blocked;
            case "unknownFutureValue": return UnknownFutureValue;
            default: return null;
        }
    }
}
