package cat.itacademy.barcelonactiva.medina.german.s05.t01.n01.model.services;

import cat.itacademy.barcelonactiva.medina.german.s05.t01.n01.model.dto.BranchDTO;
import cat.itacademy.barcelonactiva.medina.german.s05.t01.n01.model.exception.BranchDoesNotExistException;

import java.util.List;

public interface BranchServiceInterface {
    void createBranch(BranchDTO branchDTO);
    void updateBranch(int id, BranchDTO branchDTO) throws BranchDoesNotExistException;
    void deleteBranch(int id) throws BranchDoesNotExistException;
    BranchDTO getBranchById(int id) throws BranchDoesNotExistException;
    List<BranchDTO> getBranches();
}
