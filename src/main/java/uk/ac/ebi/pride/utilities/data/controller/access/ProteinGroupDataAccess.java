package uk.ac.ebi.pride.utilities.data.controller.access;

import uk.ac.ebi.pride.utilities.data.core.ProteinGroup;

import java.util.Collection;
import java.util.Map;

/**
 * ProteinAmbiguityGroupDataAccess defines the interface for accessing protein grouping information.
 *
 * @author rwang
 * @version $Id$
 */
public interface ProteinGroupDataAccess {

    /**
     * Whether this controller contains protein groups information
     *
     * @return boolean  return true if identifications exist
     */
    public boolean hasProteinAmbiguityGroup();

    /**
     * Get a collection of identification group ids
     *
     * @return Collection   a string collection of identification ids
     */
    public Collection<Comparable> getProteinAmbiguityGroupIds();

    /**
     * Get the total number of protein ambiguity groups
     *
     * @return  number of protein ambiguity groups
     */
    public int getNumberOfProteinAmbiguityGroups();

    /**
     * Get protein ambiguity group using protein group id
     *
     * @param proteinGroupId protein group id
     * @return  protein group
     */
    public ProteinGroup getProteinAmbiguityGroupById(Comparable proteinGroupId);

    /**
     * This method sets the protein groups calculated by a protein inference.
     * <p>
     * After the protein groups are set to "!= null", these protein groups are
     * returned and all other implementation of protein groups are ignored.
     * 
     * @param proteinGroups
     */
    public void setInferredProteinGroups(Map<Comparable, ProteinGroup> proteinGroups);
}
