package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of agreement entities. */
public class ThumbnailSet extends Entity implements Parsable {
    /** A 1920x1920 scaled thumbnail. */
    private Thumbnail _large;
    /** A 176x176 scaled thumbnail. */
    private Thumbnail _medium;
    /** A 48x48 cropped thumbnail. */
    private Thumbnail _small;
    /** A custom thumbnail image or the original image used to generate other thumbnails. */
    private Thumbnail _source;
    /**
     * Instantiates a new thumbnailSet and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ThumbnailSet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a thumbnailSet
     */
    @javax.annotation.Nonnull
    public static ThumbnailSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ThumbnailSet();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("large", (n) -> { this.setLarge(n.getObjectValue(Thumbnail::createFromDiscriminatorValue)); });
        deserializerMap.put("medium", (n) -> { this.setMedium(n.getObjectValue(Thumbnail::createFromDiscriminatorValue)); });
        deserializerMap.put("small", (n) -> { this.setSmall(n.getObjectValue(Thumbnail::createFromDiscriminatorValue)); });
        deserializerMap.put("source", (n) -> { this.setSource(n.getObjectValue(Thumbnail::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the large property value. A 1920x1920 scaled thumbnail.
     * @return a thumbnail
     */
    @javax.annotation.Nullable
    public Thumbnail getLarge() {
        return this._large;
    }
    /**
     * Gets the medium property value. A 176x176 scaled thumbnail.
     * @return a thumbnail
     */
    @javax.annotation.Nullable
    public Thumbnail getMedium() {
        return this._medium;
    }
    /**
     * Gets the small property value. A 48x48 cropped thumbnail.
     * @return a thumbnail
     */
    @javax.annotation.Nullable
    public Thumbnail getSmall() {
        return this._small;
    }
    /**
     * Gets the source property value. A custom thumbnail image or the original image used to generate other thumbnails.
     * @return a thumbnail
     */
    @javax.annotation.Nullable
    public Thumbnail getSource() {
        return this._source;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("large", this.getLarge());
        writer.writeObjectValue("medium", this.getMedium());
        writer.writeObjectValue("small", this.getSmall());
        writer.writeObjectValue("source", this.getSource());
    }
    /**
     * Sets the large property value. A 1920x1920 scaled thumbnail.
     * @param value Value to set for the large property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLarge(@javax.annotation.Nullable final Thumbnail value) {
        this._large = value;
    }
    /**
     * Sets the medium property value. A 176x176 scaled thumbnail.
     * @param value Value to set for the medium property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMedium(@javax.annotation.Nullable final Thumbnail value) {
        this._medium = value;
    }
    /**
     * Sets the small property value. A 48x48 cropped thumbnail.
     * @param value Value to set for the small property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSmall(@javax.annotation.Nullable final Thumbnail value) {
        this._small = value;
    }
    /**
     * Sets the source property value. A custom thumbnail image or the original image used to generate other thumbnails.
     * @param value Value to set for the source property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSource(@javax.annotation.Nullable final Thumbnail value) {
        this._source = value;
    }
}
