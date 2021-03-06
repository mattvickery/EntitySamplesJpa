package com.greendot.entity.people;

import com.greendot.entity.product.Good;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

import static org.apache.commons.lang3.builder.ToStringStyle.SIMPLE_STYLE;

/**
 * @author matt.d.vickery@greendotsoftware.co.uk
 * @since 11/3/16.
 */
@Entity
@Table(name = "ROLE")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ROLE_ID")
    private Long roleId;

    @Column(name = "NAME", nullable = false)
    private String name;

    public Long getRoleId() {

        return roleId;
    }

    public String getName() {

        return name;
    }

    public Role setRoleId(final Long roleId) {

        this.roleId = roleId;
        return this;
    }

    public Role setName(final String name) {

        this.name = name;
        return this;
    }

    @Override
    public boolean equals(final Object o) {

        if (o == null)
            return false;
        if (this == o)
            return true;
        if (!(Hibernate.getClass(o).equals(Good.class)))
            return false;

        final Role role = (Role) o;
        if ((roleId != null) && (role.roleId == roleId))
            return true;
        if (roleId == null)
            return EqualsBuilder.reflectionEquals(this, role, "roleId");
        return false;
    }

    @Override
    public int hashCode() {

        if (roleId != null)
            return Objects.hashCode(roleId);
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return new ReflectionToStringBuilder(this, SIMPLE_STYLE).toString();
    }
}